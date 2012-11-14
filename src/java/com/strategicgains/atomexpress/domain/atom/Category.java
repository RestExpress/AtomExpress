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

/**
 * Bean for category elements of an Atom feed.
 * 
 * @author toddf
 * @since 24 Feb 2011
 */
public class Category
{
	private String term;
	private String scheme;
	private String schemeResolved;
	private String label;

	public Category()
	{
		super();
	}
	
	public Category(Category that)
	{
		this();
		setTerm(that.term);
		setScheme(that.scheme);
		setSchemeResolved(that.schemeResolved);
		setLabel(that.label);
	}

	public String getTerm()
	{
		return term;
	}

	public Category setTerm(String term)
	{
		this.term = term;
		return this;
	}

	public String getScheme()
	{
		return scheme;
	}

	public Category setScheme(String scheme)
	{
		this.scheme = scheme;
		return this;
	}

	public String getSchemeResolved()
	{
		return schemeResolved;
	}

	public Category setSchemeResolved(String schemeResolved)
	{
		this.schemeResolved = schemeResolved;
		return this;
	}

	public String getLabel()
	{
		return label;
	}

	public Category setLabel(String label)
	{
		this.label = label;
		return this;
	}
}
