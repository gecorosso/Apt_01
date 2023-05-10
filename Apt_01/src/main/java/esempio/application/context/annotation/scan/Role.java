package esempio.application.context.annotation.scan;

import org.springframework.stereotype.Component;

@Component(value="role")
public class Role {	
		public String getRole() {
			return "SuperUser";
		}	
}
