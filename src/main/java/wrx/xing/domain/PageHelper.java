package wrx.xing.domain;

/**
 * Created by Administrator on 2017/3/25.
 */
public class PageHelper {
    private boolean counter = false;//是否进行select count(*) 默认为false进行分页列表获取
    private Integer pageSize;
    private Integer pageNumber;
    private Integer page;
    private Integer total;
    private Integer start;
    private Integer end;

    public PageHelper() {

    }

    public PageHelper(Integer pageNumber, Integer pageSize, Integer total) {
        this.pageNumber = pageNumber;
        this.start = pageNumber;
        this.pageSize = pageSize;
        this.total = total;
        this.page = pageNumber == 0 ? 1 : (pageNumber / pageSize) + 1;
        this.end = pageNumber + pageSize >= total ? total : pageNumber + pageSize;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        this.start = pageNumber;
        if (null != pageSize) {
            this.page = pageNumber == 0 ? 1 : (pageNumber / pageSize) + 1;
            if (null != this.total) {
                this.end = pageNumber + pageSize >= total ? total : pageNumber + pageSize;
            } else {
                this.end = pageNumber + pageSize;
            }
        }
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
        if (null != this.pageNumber && null != this.pageSize) {
            this.page = pageNumber == 0 ? 1 : (pageNumber / pageSize) + 1;
            this.end = pageNumber + pageSize >= total ? total : pageNumber + pageSize;
        }
    }

    public boolean isCounter() {
        return counter;
    }

    public void setCounter(boolean counter) {
        this.counter = counter;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }
}
