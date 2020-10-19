/*
 * The MIT License
 *
 * Copyright 2020 Intuit Inc.
 *
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
package com.intuit.karate.runtime;

import com.intuit.karate.http.Cookie;
import com.intuit.karate.http.HttpResponse;
import com.intuit.karate.http.MultiPartItem;
import com.intuit.karate.http.MultiValuedMap;
import java.io.InputStream;
import java.util.List;

/**
 *
 * @author pthomas3
 */
public class DefaultHttpClient extends ScenarioHttpClient<Object> {

    @Override
    public void configure(Config config) {
        
    }

    @Override
    protected Object getEntity(List<MultiPartItem> multiPartItems, String mediaType) {
        return null;
    }

    @Override
    protected Object getEntity(MultiValuedMap formFields, String mediaType) {
        return null;
    }

    @Override
    protected Object getEntity(InputStream stream, String mediaType) {
        return null;
    }

    @Override
    protected Object getEntity(String content, String mediaType) {
        return null;
    }

    @Override
    protected void buildUrl(String url) {
        
    }

    @Override
    protected void buildPath(String path) {
        
    }

    @Override
    protected void buildParam(String name, Object... values) {
        
    }

    @Override
    protected void buildHeader(String name, Object value, boolean replace) {
        
    }

    @Override
    protected void buildCookie(Cookie cookie) {
        
    }

    @Override
    protected HttpResponse makeHttpRequest(Object entity) {
        return null;
    }

    @Override
    protected String getRequestUri() {
        return null;
    }
    
}
