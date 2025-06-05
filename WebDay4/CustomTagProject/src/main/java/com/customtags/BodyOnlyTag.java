package com.customtags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class BodyOnlyTag extends BodyTagSupport{
	   @Override
	    public int doEndTag() throws JspException {
	        try {
	            String content = bodyContent.getString().trim();
	            JspWriter out =pageContext.getOut();
	            out.println("<b> Body Content: " + content +"</b>");
	        } catch (IOException e) {
	            throw new JspException("Error in BodyOnlyTag", e);
	        }
	        return EVAL_PAGE;
	    }
}
