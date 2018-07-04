package multiling.com.sampleandroidapp.rectrofit;

import okhttp3.OkHttpClient;

/**
 * Singleton class to build and provide instance of OkHTTPClient
 */
public class Client {

    private OkHttpClient mOkHttpClient;
    private static Client instance;


    private Client() {
        mOkHttpClient = new OkHttpClient.Builder()
                .build();
    }


    public static synchronized Client getInstance() {
        if (instance == null) {
            instance = new Client();
        }
        return instance;
    }


    OkHttpClient getOkHttpClient() {
        return mOkHttpClient;
    }
}
