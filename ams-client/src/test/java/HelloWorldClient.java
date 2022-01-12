import com.apex.ams.AmsConfigure;
import com.apex.ams.client.AmsServiceManager;
import com.apex.ams.client.SimpleServiceRefer;
import com.apex.ams.helloworld.HelloRequest;
import com.apex.ams.helloworld.HelloResponse;
import com.apex.ams.helloworld.HelloworldServiceGrpc;
import com.apex.ams.helloworld.Record;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jiangtao
 * @date 2022/1/10 11:42
 */
public class HelloWorldClient {
    private HelloworldServiceGrpc.HelloworldServiceBlockingStub stub;

    static {
        Map<String, String> props = new HashMap<>();
        props.put("ams.authority", "rick");
        props.put("ams.ca.certFile", HelloWorldClient.class.getResource("/cert/ca-cert.pem").getPath());
        props.put("ams.client.certFile", HelloWorldClient.class.getResource("/cert/client-cert.pem").getPath());
        props.put("ams.client.keyFile", HelloWorldClient.class.getResource("/cert/client.pkcs8.pem").getPath());

        props.put("ams.registry.protocol", "zk");
        props.put("ams.registry.address", "127.0.0.1:2181");
        ZkConfigValueProvider configValueProvider = new ZkConfigValueProvider(props);
        AmsConfigure.getInstance().setValueProvider(configValueProvider);
    }

    public HelloworldServiceGrpc.HelloworldServiceBlockingStub getStub(){
        synchronized (this) {
            try{
                stub = (HelloworldServiceGrpc.HelloworldServiceBlockingStub) AmsServiceManager.getInstance()
                        .newBlockingStub(SimpleServiceRefer.newRefer(HelloworldServiceGrpc.class));
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return stub;
    }
    public static void main(String... args){
        HelloWorldClient client  =new HelloWorldClient();
        HelloRequest.Builder builder = HelloRequest.newBuilder();
        builder.setFunc("func");
        builder.setName("name");
        builder.setHeader("header");
        builder.setBody("body");
        HelloResponse resp = client.getStub().firstService(builder.build());
        System.out.println("code="+resp.getCode());
        List<Record> records =  resp.getRecordsList();
        for(Record record:records){
            System.out.println(record.getId()+","+record.getRowName());
        }
    }
}
