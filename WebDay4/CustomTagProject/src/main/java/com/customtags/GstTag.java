package com.customtags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class GstTag extends TagSupport{
	private double amount;
	private double percent;

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}
	
	 @Override
	    public int doStartTag() throws JspException {
	        try {
	        	JspWriter out=pageContext.getOut();
	        	
	            out.println("Amount is : " + amount +"<br>");
	            out.println("GST %     : " + percent+"<br>");
	            double gst=amount*percent;
	            out.println("GST amount is : " + gst+ "<br>");
	            out.println("Total amount is "+(amount + gst)+"<br>");
	            
	        } catch (IOException e) {
	            throw new JspException("Error in AttributeTag", e);
	        }
	        return SKIP_BODY;
	    }

}
