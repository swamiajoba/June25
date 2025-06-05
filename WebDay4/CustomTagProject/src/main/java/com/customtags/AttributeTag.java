package com.customtags;

import java.io.IOException;
import javax.servlet.jsp.tagext.TagSupport;
import javax.servlet.jsp.JspException;

public class AttributeTag extends TagSupport {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public int doStartTag() throws JspException {
        try {
            pageContext.getOut().println("Attribute Message: " + message);
        } catch (IOException e) {
            throw new JspException("Error in AttributeTag", e);
        }
        return SKIP_BODY;
    }
}