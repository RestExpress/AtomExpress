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
 * Bean for Atom feeds.
 * 
 * @author toddf
 */
public class Feed
{
	private String xmlBase;
	private List<Category> categories;
	private List<Person> authors;
	private List<Person> contributors;
	private Generator generator;
	private String icon;
	private String id;
	private String logo;
	private String rights; // AKA copyright
	private Content subtitle; // AKA tagline
	private Content title;
	private Date updated; // AKA modified
	private List<Link> alternateLinks;
	private List<Link> otherLinks;
	private List<Entry> entries;

	private List extensions;

	private Content info; // Atom 0.3 only
	private String language; // Atom 0.3 only
}
