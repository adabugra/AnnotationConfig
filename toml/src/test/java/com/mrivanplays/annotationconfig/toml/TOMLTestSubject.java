package com.mrivanplays.annotationconfig.toml;

import com.mrivanplays.annotationconfig.core.Comment;
import com.mrivanplays.annotationconfig.core.ConfigObject;
import com.mrivanplays.annotationconfig.core.Key;

@Comment("Generated by AnnotationConfig v1.0")
public class TOMLTestSubject {

  @Comment("name")
  private String name = "Ivan";

  @Comment("bar")
  private boolean bar = false;

  @ConfigObject private MySection server = new MySection();

  @Comment("Server")
  public static class MySection {

    // field comments in section are not supported

    @Key("ip")
    private String hipi = "localhost";

    @Key("theport")
    private int port = 25565;

    public String getHipi() {
      return hipi;
    }

    public int getPort() {
      return port;
    }
  }

  public String getName() {
    return name;
  }

  public boolean isBar() {
    return bar;
  }

  public MySection getServer() {
    return server;
  }
}
