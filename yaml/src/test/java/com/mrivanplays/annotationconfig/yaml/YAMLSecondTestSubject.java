package com.mrivanplays.annotationconfig.yaml;

import com.mrivanplays.annotationconfig.core.Comment;
import com.mrivanplays.annotationconfig.core.ConfigObject;
import com.mrivanplays.annotationconfig.core.Key;
import com.mrivanplays.annotationconfig.core.TypeResolver;
import java.util.Arrays;
import java.util.List;

@Comment("Generated by AnnotationConfig v1.0")
public class YAMLSecondTestSubject {

  @Comment("name")
  private String name = "Ivan";

  @Comment("foo")
  private String foo = "bar";

  @ConfigObject
  private Messages messages = new Messages();

  @Comment("bar")
  private String bar = "baz";

  @Comment("this is a list")
  @TypeResolver(StringListResolver.class)
  private List<String> list = Arrays.asList("Hello", "bla bla");

  @Comment("baz")
  private int a = 1;

  @Comment("All supported messages")
  public static class Messages {

    // comments in sections are not supported

    @Key("no-console")
    private String noConsole = "No console!";

    @Key("console-only")
    private String consoleOnly = "This command is console only!";

    public String getNoConsole() {
      return noConsole;
    }

    public String getConsoleOnly() {
      return consoleOnly;
    }
  }

  public String getName() {
    return name;
  }

  public String getFoo() {
    return foo;
  }

  public Messages getMessages() {
    return messages;
  }

  public String getBar() {
    return bar;
  }

  public List<String> getList() {
    return list;
  }

  public int getA() {
    return a;
  }
}
