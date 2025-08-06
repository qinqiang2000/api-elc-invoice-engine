package com.kingdee.fpy.commom;



public class ResultPage extends Result {

//    private int totalPage;
//    private int pageSize;
//    private int currentPage;
//    private int totalElement;
//
//    public ResultPage() {
//    }
//
//    public ResultPage(String errcode, String description) {
//        super.errcode = errcode;
//        super.description = description;
//    }
//
//    public ResultPage(ErrorType errorType) {
//        super.errcode = errorType.getErrcode();
//        super.description = errorType.getDescription();
//    }
//
//    public ResultPage(ErrorType errorType, Object data, int totalElement, int totalPage, int pageSize, int currentPage) {
//        super.errcode = errorType.getErrcode();
//        super.description = errorType.getDescription();
//        super.data = data;
//        this.totalElement = totalElement;
//        this.totalPage = totalPage;
//        this.pageSize = pageSize;
//        this.currentPage = currentPage;
//    }
//
//    public static ResultPage extendError(BaseResult baseResult) {
//        return baseResult == null ? null : new ResultPage(baseResult.getErrcode(), baseResult.getDescription());
//    }
//
//    public ResultPage(String errcode, String description, Object data, int totalElement, int totalPage, int pageSize, int currentPage) {
//        super.errcode = errcode;
//        super.description = description;
//        super.data = data;
//        this.totalElement = totalElement;
//        this.totalPage = totalPage;
//        this.pageSize = pageSize;
//        this.currentPage = currentPage;
//    }
//
//    public ResultPage(Integer currentPage, Integer pageSize) {
//        super(ErrorType.SUCCESS);
//        this.currentPage = currentPage == null ? 1 : currentPage;
//        this.pageSize = pageSize == null ? 10 : pageSize;
//    }
//
//    public ResultPage(Object data, Integer currentPage, Integer pageSize, Integer totalElement) {
//        this.data = data;
//        this.currentPage = currentPage == null ? 1 : currentPage;
//        this.pageSize = pageSize == null ? 10 : pageSize;
//        this.setTotalElement(totalElement);
//    }
//
//    public int getTotalElement() {
//        return this.totalElement;
//    }
//
//    public void setTotalElement(int totalElement) {
//        this.totalElement = totalElement;
//        if (this.totalElement % this.pageSize == 0) {
//            this.totalPage = totalElement / this.pageSize;
//        } else {
//            this.totalPage = this.totalElement / this.pageSize + 1;
//        }
//
//    }
//
//    public int getTotalPage() {
//        return this.totalPage;
//    }
//
//    public void setTotalPage(int totalPage) {
//        this.totalPage = totalPage;
//    }
//
//    public int getPageSize() {
//        return this.pageSize;
//    }
//
//    public void setPageSize(int pageSize) {
//        this.pageSize = pageSize;
//    }
//
//    public int getCurrentPage() {
//        return this.currentPage;
//    }
//
//    public void setCurrentPage(int currentPage) {
//        this.currentPage = currentPage;
//    }
//
//    public int index() {
//        return (this.currentPage - 1) * this.pageSize;
//    }
//
//    public int totalNum() {
//        return this.totalElement % this.pageSize == 0 ? this.totalElement / this.pageSize : this.totalElement / this.pageSize + 1;
//    }
//
//    public int startIndex() {
//        return (this.currentPage - 1) * this.pageSize;
//    }
}
