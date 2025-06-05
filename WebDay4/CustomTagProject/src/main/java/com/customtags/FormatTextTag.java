package com.customtags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class FormatTextTag extends BodyTagSupport{
	private boolean bold;
	private boolean underline;

	public void setBold(boolean bold) {
		this.bold = bold;
	}

	public void setUnderline(boolean underline) {
		this.underline = underline;
	}
	
	  @Override
	    public int doEndTag() throws JspException {
	        try {
	            String content = bodyContent.getString().trim();
	            JspWriter out=pageContext.getOut();
	            if(bold==true && underline==true) {
	            	out.println("<b><u> "+content+"</b></u>");
	            }
	            if(bold==true && underline==false) {
	            	out.println("<b> "+content+"</b>");
	            }
	            if(bold==false && underline==true) {
	            	out.println("<u> "+content+"</u>");
	            }
	            if(bold==false && underline==false) {
	            	out.println(content);
	            }
	        
	        } catch (IOException e) {
	            throw new JspException("Error in AttributeBodyTag", e);
	        }
	        return EVAL_PAGE;
	    }
	
}
