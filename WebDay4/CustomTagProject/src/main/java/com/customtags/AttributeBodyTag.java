package com.customtags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class AttributeBodyTag extends BodyTagSupport{
    private String prefix;

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    @Override
    public int doEndTag() throws JspException {
        try {
            String content = bodyContent.getString().trim();
            pageContext.getOut().println(prefix + ": " + content);
        } catch (IOException e) {
            throw new JspException("Error in AttributeBodyTag", e);
        }
        return EVAL_PAGE;
    }
}
