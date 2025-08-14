package com.kingdee.fpy.commom;




public class ResultPage extends Result {

    private int totalPage;
    private int pageSize;
    private int currentPage;
    private int totalElement;

    public ResultPage() {
    }

    public ResultPage(String errcode, String description) {
        super.errcode = errcode;
        super.message = description;
    }

    public ResultPage(ResultType errorType) {
        super.errcode = errorType.getCode();
        super.message = errorType.getMessage();
    }

    public ResultPage(ResultType errorType, Object data, int totalElement, int totalPage, int pageSize, int currentPage) {
        super.errcode = errorType.getCode();
        super.message = errorType.getMessage();
        super.data = data;
        this.totalElement = totalElement;
        this.totalPage = totalPage;
        this.pageSize = pageSize;
        this.currentPage = currentPage;
    }


    public ResultPage(String errcode, String description, Object data, int totalElement, int totalPage, int pageSize, int currentPage) {
        super.errcode = errcode;
        super.message = description;
        super.data = data;
        this.totalElement = totalElement;
        this.totalPage = totalPage;
        this.pageSize = pageSize;
        this.currentPage = currentPage;
    }

    public ResultPage(Object data, Integer currentPage, Integer pageSize, Integer totalElement) {
        this.data = data;
        this.currentPage = currentPage == null ? 1 : currentPage;
        this.pageSize = pageSize == null ? 10 : pageSize;
        this.setTotalElement(totalElement);
    }

    public int getTotalElement() {
        return this.totalElement;
    }

    public void setTotalElement(int totalElement) {
        this.totalElement = totalElement;
        if (this.totalElement % this.pageSize == 0) {
            this.totalPage = totalElement / this.pageSize;
        } else {
            this.totalPage = this.totalElement / this.pageSize + 1;
        }

    }

    public int getTotalPage() {
        return this.totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int index() {
        return (this.currentPage - 1) * this.pageSize;
    }

    public int totalNum() {
        return this.totalElement % this.pageSize == 0 ? this.totalElement / this.pageSize : this.totalElement / this.pageSize + 1;
    }

    public int startIndex() {
        return (this.currentPage - 1) * this.pageSize;
    }
}
