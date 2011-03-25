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
package com.strategicgains.atomexpress.domain.atom;

import java.util.Date;
import java.util.List;

/**
 * Bean for entry elements of an Atom feed.
 * 
 * @author toddf
 * @since 24 Feb 2011
 */
public class Entry
{
	private String xmlBase;
	private List<String> authors;
	private List<String> contributors;
	private List<Category> categories;
	private List<String> contents;
	private String id;
	private Date published; // AKA issued
	private String rights;
	private Feed source;
	private Content summary;
	private Content title;
	private Date updated; // AKA modified
	private List<Link> alternateLinks;
	private List<Link> otherLinks;
	private List<String> foreignMarkup;

	private List extensions;

	private Date created; // Atom 0.3 only
}
