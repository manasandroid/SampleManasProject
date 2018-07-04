package multiling.com.sampleandroidapp.rectrofit;


public interface WikiSearchListener {

    void onSearchComplete(SearchResult searchResult);

    void onSearchFailed(String searchTerm);
}
