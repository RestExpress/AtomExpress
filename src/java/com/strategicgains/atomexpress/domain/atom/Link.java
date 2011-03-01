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
 * Bean for link elements of an Atom feed.
 * <p>
 * 
 * @author toddf
 * @since 24 Feb 2011
 */
public class Link
{
	private String href;
	private String hrefResolved;
	private String rel = "alternate";
	private String type;
	private String hreflang;
	private String title;
	private long length;
}
