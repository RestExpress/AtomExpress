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
 * <p>
 * It handles Atom feeds version 0.3 without loosing any feed information.
 * <p>
 * 
 * @author Alejandro Abdelnur
 * @author Dave Johnson (updated for Atom 1.0)
 */
public class Feed
{
	private String xmlBase;
	private List categories;
	private List authors;
	private List contributors;
	private Generator generator;
	private String icon;
	private String id;
	private String logo;
	private String rights; // AKA copyright
	private Content subtitle; // AKA tagline
	private Content title;
	private Date updated; // AKA modified
	private List alternateLinks;
	private List otherLinks;
	private List entries;

	private List extensions;

	private Content info; // Atom 0.3 only
	private String language; // Atom 0.3 only
}
