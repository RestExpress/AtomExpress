/*
    Copyright 2011, Strategic Gains, Inc.

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package com.strategicgains.atomexpress.domain.rss;

import java.util.Date;
import java.util.List;

/**
 * Bean for items of RSS feeds.
 * 
 * @author toddf
 */
public class Item
{
    private String title;
    private String link;
    private String uri;
    private Description description;
    private Content content;
    private Source source;
    private List enclosures;
    private List categories;
    private Guid guid;
    private String comments;
    private String author;
    private Date pubDate;
    private Date expirationDate;
    private List modules;
    private List foreignMarkup;
}
