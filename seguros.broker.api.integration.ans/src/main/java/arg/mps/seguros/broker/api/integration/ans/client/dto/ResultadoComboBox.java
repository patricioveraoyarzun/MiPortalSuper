package arg.mps.seguros.broker.api.integration.ans.client.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultadoComboBox {
	@JsonProperty("ComboBoxList")
    private ComboBoxList[] comboBoxList;

	@JsonProperty("Parametrica")
    private String parametrica;

    public ComboBoxList[] getComboBoxList ()
    {
        return comboBoxList;
    }

    public void setComboBoxList (ComboBoxList[] comboBoxList)
    {
        this.comboBoxList = comboBoxList;
    }

    public String getParametrica ()
    {
        return parametrica;
    }

    public void setParametrica (String parametrica)
    {
        this.parametrica = parametrica;
    }

	 @Override
	    public String toString() {
		 return ReflectionToStringBuilder.toString(this, 
		            ToStringStyle.MULTI_LINE_STYLE, true, true);
	 }	
}
