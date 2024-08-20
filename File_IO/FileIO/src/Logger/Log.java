package Logger;

import java.io.Serializable;

public class Log implements Serializable {
	static Long idCount=0L;
	Long id;
	String errorMessage;
	String className;
	String methodName;
	String description;
	Long timeStamp; // zaman bilgisi.
	
	public Log() {
	}
	
	public Log( String errorMessage, String className, String methodName, String description, Long timeStamp) {
		this.id = ++idCount;
		this.errorMessage = errorMessage;
		this.className = className;
		this.methodName = methodName;
		this.description = description;
		this.timeStamp = timeStamp;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public String getMethodName() {
		return methodName;
	}
	
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Long getTimeStamp() {
		return timeStamp;
	}
	
	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	@Override
	public String toString() {
		return "Log{" + "id=" + getId() + ", errorMessage='" + getErrorMessage() + '\'' + ", className='" + getClassName() + '\'' + ", methodName='" + getMethodName() + '\'' + ", description='" + getDescription() + '\'' + ", timeStamp=" + getTimeStamp() + '}';
	}
}