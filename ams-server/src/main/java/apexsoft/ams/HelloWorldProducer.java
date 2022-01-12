package apexsoft.ams;

import com.apex.ams.helloworld.HelloRequest;
import com.apex.ams.helloworld.HelloResponse;
import com.apex.ams.helloworld.HelloworldServiceGrpc;
import com.apex.ams.helloworld.Record;
import com.apex.ams.server.AmsService;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;


/**
 * @author jiangtao
 * @date 2022/1/10 10:24
 */

@AmsService
public class HelloWorldProducer extends HelloworldServiceGrpc.HelloworldServiceImplBase {
    private static final Logger log = LoggerFactory.getLogger(HelloWorldProducer.class);

    @Override
    public void firstService(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
       HelloResponse.Builder builder=HelloResponse.newBuilder();
       try {
           int count=5;
           builder.setCode(1).setNote("[hello]ok").setCount(count);
           for(int i=1;i<=count;i++){
               Record record = Record.newBuilder()
                       .setId(i)
                       .setRowCode("行：rowCode:"+ UUID.randomUUID().toString())
                       .setRowName("行：rowName:"+UUID.randomUUID().toString())
                       .build();
               builder.addRecords(record);
           }
           builder.setCount(count);
       }catch (Exception e){
           e.printStackTrace();
           log.error(e.getMessage());
           builder.setCode(-1).setNote("[esb]error:"+e.getMessage());
       }finally {
           HelloResponse resp = builder.build();
           responseObserver.onNext(resp);
           responseObserver.onCompleted();
       }
    }
}
