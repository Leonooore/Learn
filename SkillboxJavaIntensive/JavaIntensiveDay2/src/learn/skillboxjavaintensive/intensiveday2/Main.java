package learn.skillboxjavaintensive.intensiveday2;

import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;

public class Main {

    private static final String ACCESS_TOKEN = "8GpIngND9yAAAAAAAAAAN4UuZ2e0aqWAOPwb-N5pMGY__cqCK-Hz9Ny6-tm9rvXo";

    public static void main(String[] args) {
        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
        MyThread thread = new MyThread();
        thread.client = new DbxClientV2(config, ACCESS_TOKEN);
        thread.start();
    }
}
