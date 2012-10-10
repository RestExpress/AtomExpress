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
 * Bean for person elements of an Atom feed.
 * 
 * @author toddf
 */
public class Person
{
	private String name;
	private String uri;
	private String uriResolved;
	private String email;
//	private List extensions;

	public Person()
	{
		super();
	}
	
	public Person(Person that)
	{
		this();
		setName(that.name);
		setUri(that.uri);
		setUriResolved(that.uriResolved);
		setEmail(that.email);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getUri()
	{
		return uri;
	}

	public void setUri(String uri)
	{
		this.uri = uri;
	}

	public String getUriResolved()
	{
		return uriResolved;
	}

	public void setUriResolved(String uriResolved)
	{
		this.uriResolved = uriResolved;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}
}
