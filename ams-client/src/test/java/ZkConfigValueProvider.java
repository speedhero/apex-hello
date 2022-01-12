import com.apex.ams.ConfigValueProvider;

import java.util.Map;

/**
 * @author jiangtao
 * @date 2022/1/10 11:41
 */
public class ZkConfigValueProvider implements ConfigValueProvider {
    private Map<String, String> props;

    public ZkConfigValueProvider(Map<String, String> properties) {
        this.props = properties;
    }

    @Override
    public String getValue(String key) {
        return props.get(key);
    }
}
