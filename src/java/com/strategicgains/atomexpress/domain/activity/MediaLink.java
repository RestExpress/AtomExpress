/*
    Copyright 2012, Strategic Gains, Inc.

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
package com.strategicgains.atomexpress.domain.activity;

/**
 * @author toddf
 * @since Oct 9, 2012
 */
public class MediaLink
{
	private String duration;
	private String height;
	private String url;
	private String width;

	public MediaLink()
	{
		super();
	}
	
	public MediaLink(MediaLink that)
	{
		this();
		this.duration = that.duration;
		this.height = that.height;
		this.url = that.url;
		this.width = that.width;
	}

	public String getDuration()
	{
		return duration;
	}

	public void setDuration(Integer duration)
	{
		this.duration = (duration == null ? null : String.valueOf(duration.intValue()));
	}

	public String getHeight()
	{
		return height;
	}

	public void setHeight(Integer height)
	{
		this.height = (height == null ? null : String.valueOf(height.intValue()));
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public String getWidth()
	{
		return width;
	}

	public void setWidth(Integer width)
	{
		this.width = (width == null ? null : String.valueOf(width.intValue()));
	}
}
