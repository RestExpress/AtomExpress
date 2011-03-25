/*
 * Copyright 2011 Strategic Gains, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.strategicgains.atomexpress.domain.rss;

import java.util.*;

/**
 * Bean for RSS feeds.
 * 
 * @author toddf
 */
public class Channel
{
	private String title;
	private String description;
	private String link;
	private String uri;
	private Image image;
	private List<Item> items;
	private TextInput textInput;
	private String language;
	private String rating;
	private String copyright;
	private Date pubDate;
	private Date lastBuildDate;
	private String docs;
	private String managingEditor;
	private String webMaster;
	private List skipHours;
	private List<Days> skipDays;
	private Cloud cloud;
	private List categories;
	private String generator;
	private int ttl = -1;
	private List modules;
}
