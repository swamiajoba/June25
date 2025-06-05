package com.customtags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class SimpleTag extends TagSupport{
	  @Override
	    public int doStartTag() throws JspException {
	        try {
	            pageContext.getOut().println("Hello from Simple Tag (TagSupport)");
	        } catch (IOException e) {
	            throw new JspException("Error in SimpleTag", e);
	        }
	        return SKIP_BODY;
	    }

}
