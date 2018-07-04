package multiling.com.sampleandroidapp.rectrofit;

import java.util.Map;

public class SearchResultQuery {

    private Map<Long, SearchResultPage> pages;

    public Map<Long, SearchResultPage> getPages() {
        return pages;
    }

    public void setPages(Map<Long, SearchResultPage> pages) {
        this.pages = pages;
    }
}
