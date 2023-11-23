package in.ineuron.props;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix="demo")
public class DemoConfigProps {
	
	Map<String, String> properties = new HashMap<String, String>();

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	public DemoConfigProps(Map<String, String> properties) {
		super();
		this.properties = properties;
	}

	public DemoConfigProps() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
