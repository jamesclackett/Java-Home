package oop.access_modifiers.two;


public class C {
    String defaultMessage = "This is the default";  // default modifier (none) is only
                                                    // visible within the same package
    public String publicMessage = "This is public"; // visible to other packages
    protected String protectedMessage = "This is protected"; // visible to subclasses in other packages
                                                                // visible in same package
    private String privateMessage = "This is protected";  // visible to class

}
