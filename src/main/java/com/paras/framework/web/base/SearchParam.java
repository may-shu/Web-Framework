package com.paras.framework.web.base;

import org.apache.commons.lang3.StringUtils;


/**
 * Class to model a search operations' basic parameters.
 * @author Paras.
 */
public abstract class SearchParam {
	/**
	 * Current Page of the search result.
	 */
	protected int currentPage;
	
	/**
	 * Number of results in page.
	 */
	protected int pageSize;
	
	/**
	 * Text to enable omni search.
	 */
	protected String text;
	
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
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public SearchParam() {
		
	}
	
	public SearchParam( int currentPage, int pageSize ) {
		this.currentPage = currentPage;
		this.pageSize = pageSize;
	}
	
	/**
	 * To check is search param is empty.
	 * @return
	 */
	public abstract boolean isEmpty();
	
	/**
	 * To check if search is simple.
	 */
	public boolean isSimpleSearch() {
		if( isEmpty() ) {
			return false;
		} else {
			
			return StringUtils.isNotBlank( text );
			
		}
	}
	
	/**
	 * To check if search is advanced.
	 */
	public abstract boolean isAdvancedSearch();
}
