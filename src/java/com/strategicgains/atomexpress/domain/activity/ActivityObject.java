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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author toddf
 * @since Oct 9, 2012
 */
public class ActivityObject
{
	private List<ActivityObject> attachments;
	private ActivityObject author;
	private String content;
	private String displayName;
	private List<String> downstreamDuplicates;
	private String id;
	private MediaLink image;
	private String objectType;
	private Date published;
	private String summary;
	private Date updated;
	private List<String> upstreamDuplicates;
	private String url;

	public ActivityObject()
	{
		super();
	}

	public List<ActivityObject> getAttachments()
	{
		return (this.attachments == null ? null : Collections.unmodifiableList(attachments));
	}

	public void addAllAttachments(List<ActivityObject> attachments)
	{
		if (this.attachments == null)
		{
			this.attachments = new ArrayList<ActivityObject>(attachments.size());
		}

		this.attachments.addAll(attachments);
	}
	
	public void addAttachment(ActivityObject attachment)
	{
		if (this.attachments == null)
		{
			this.attachments = new ArrayList<ActivityObject>();
		}
		
		this.attachments.add(attachment);
	}

	public ActivityObject getAuthor()
	{
		return author;
	}

	public void setAuthor(ActivityObject author)
	{
		this.author = author;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public String getDisplayName()
	{
		return displayName;
	}

	public void setDisplayName(String displayName)
	{
		this.displayName = displayName;
	}

	public List<String> getDownstreamDuplicates()
	{
		return (this.downstreamDuplicates == null ? null : Collections.unmodifiableList(downstreamDuplicates));
	}

	public void addAllDownstreamDuplicates(List<String> downstreamDuplicates)
	{
		if (this.downstreamDuplicates == null)
		{
			this.downstreamDuplicates = new ArrayList<String>(downstreamDuplicates.size());
		}
		
		this.downstreamDuplicates.addAll(downstreamDuplicates);
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public MediaLink getImage()
	{
		return image;
	}

	public void setImage(MediaLink image)
	{
		this.image = image;
	}

	public String getObjectType()
	{
		return objectType;
	}

	public void setObjectType(String objectType)
	{
		this.objectType = objectType;
	}

	public Date getPublished()
	{
		return published;
	}

	public void setPublished(Date published)
	{
		this.published = published;
	}

	public String getSummary()
	{
		return summary;
	}

	public void setSummary(String summary)
	{
		this.summary = summary;
	}

	public Date getUpdated()
	{
		return updated;
	}

	public void setUpdated(Date updated)
	{
		this.updated = updated;
	}

	public List<String> getUpstreamDuplicates()
	{
		return (upstreamDuplicates == null ? null : Collections.unmodifiableList(upstreamDuplicates));
	}

	public void addAllUpstreamDuplicates(List<String> upstreamDuplicates)
	{
		if (this.upstreamDuplicates == null)
		{
			this.upstreamDuplicates = new ArrayList<String>(upstreamDuplicates.size());
		}
		
		this.upstreamDuplicates.addAll(upstreamDuplicates);
	}

	public void addUpstreamDuplicate(String upstreamDuplicate)
	{
		if (this.upstreamDuplicates == null)
		{
			this.upstreamDuplicates = new ArrayList<String>();
		}
		
		this.upstreamDuplicates.add(upstreamDuplicate);
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}
}
