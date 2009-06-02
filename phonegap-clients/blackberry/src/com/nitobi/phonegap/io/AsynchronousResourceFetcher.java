/**
 * The MIT License
 * -------------------------------------------------------------
 * Copyright (c) 2008, Rob Ellis, Brock Whitten, Brian Leroux, Joe Bowser, Dave Johnson, Nitobi
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.nitobi.phonegap.io;

/**
 * Fetches a resource and executes a callback.
 *
 * @author Jose Noheda
 *
 */
public class AsynchronousResourceFetcher implements Runnable {

	private String url;
	private Callback callback;
	private ConnectionManager connectionManager;

	public AsynchronousResourceFetcher(String url, Callback callback, ConnectionManager connectionManager) {
		this.url = url;
		this.callback = callback;
		this.connectionManager = connectionManager;
	}

	public void run() {
		callback.execute(connectionManager.getUnmanagedConnection(url));
	}

}
