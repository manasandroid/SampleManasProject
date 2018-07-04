package multiling.com.sampleandroidapp.rectrofit;

public class SearchResultPage {

    private int pageid;
    private String title;
    private SearchResultThumbnail thumbnail;

    public int getPageid() {
        return pageid;
    }

    public void setPageid(int pageid) {
        this.pageid = pageid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SearchResultThumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(SearchResultThumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }
}
