package nl.wjglerum.qute;

import io.quarkus.qute.TemplateExtension;

@TemplateExtension(namespace = "quark")
public class QuteTemplateExtension {

    static String reverse(String val) {
        return new StringBuilder(val).reverse().toString();
    }

    static String quark() {
        return "Quark!";
    }
}
