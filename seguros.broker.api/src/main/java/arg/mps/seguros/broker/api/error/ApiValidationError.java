package arg.mps.seguros.broker.api.error;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ApiValidationError extends ApiSubError {
    private String object;
    private String field;
    private Object rejectedValue;
    private String message;

    public ApiValidationError(String object, String message) {
        this.object = object;
        this.message = message;
    }

	public ApiValidationError(String object, String field, Object rejectedValue, String message) {
		this(object, message);
		this.field = field;
		this.rejectedValue = rejectedValue;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public Object getRejectedValue() {
		return rejectedValue;
	}

	public void setRejectedValue(Object rejectedValue) {
		this.rejectedValue = rejectedValue;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
   
	@Override
    public String toString() {
	 return ReflectionToStringBuilder.toString(this, 
	            ToStringStyle.MULTI_LINE_STYLE, true, true);
	 }		
}
