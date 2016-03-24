package com.paras.framework.web.base;

/**
 * Class to model a search operations' basic parameters.
 * @author Paras.
 */
public class SearchParam {
	/**
	 * Current Page of the search result.
	 */
	private int currentPage;
	
	/**
	 * Number of results in page.
	 */
	private int pageSize;
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public SearchParam() {
		
	}
	
	public SearchParam( int currentPage, int pageSize ) {
		this.currentPage = currentPage;
		this.pageSize = pageSize;
	}
}
