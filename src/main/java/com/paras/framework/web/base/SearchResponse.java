package com.paras.framework.web.base;

/**
 * Response to represent result of a search operation.
 * @author Gaurav
 *
 */
public class SearchResponse extends Response{
	
	private long count;
	private int currentPage;
	private int pageSize;
	public long getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
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
	
	public SearchResponse( long count, int currentPage, int pageSize, Object data ) {
		super( Y, MESSAGE, data );
		
		this.count = count;
		this.currentPage = currentPage;
		this.pageSize = pageSize;
	}
}
