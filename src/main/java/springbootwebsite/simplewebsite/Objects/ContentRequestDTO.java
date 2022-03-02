package springbootwebsite.simplewebsite.Objects;

public class ContentRequestDTO {
    private Integer userId;
    private Integer contentType;
    private Integer index;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getContentType() {
        return contentType;
    }

    public void setContentId(Integer contentId) {
        this.contentType = contentId;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}
