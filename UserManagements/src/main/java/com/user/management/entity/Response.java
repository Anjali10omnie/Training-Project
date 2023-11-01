package com.user.management.entity;

import java.util.Map;

public class Response <T>{
		
		private String status;
		private String message;
		
		private Map <String ,String> ResM;
		public Map<String, String> getResM() {
			return ResM;
		}
		public void setResM(Map<String, String> resM) {
			ResM = resM;
		}
		
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;


}
}
