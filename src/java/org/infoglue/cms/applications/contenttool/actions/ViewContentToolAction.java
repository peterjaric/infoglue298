/* ===============================================================================
 *
 * Part of the InfoGlue Content Management Platform (www.infoglue.org)
 *
 * ===============================================================================
 *
 *  Copyright (C)
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License version 2, as published by the
 * Free Software Foundation. See the file LICENSE.html for more information.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY, including the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc. / 59 Temple
 * Place, Suite 330 / Boston, MA 02111-1307 / USA.
 *
 * ===============================================================================
 */

package org.infoglue.cms.applications.contenttool.actions;

import org.infoglue.cms.applications.cmstool.actions.ViewCMSAbstractToolAction;

/**
 * This class implements the action class for the framed page in the content tool.
 * 
 * @author Mattias Bogeblad  
 */

public class ViewContentToolAction extends ViewCMSAbstractToolAction
{
	private static final long serialVersionUID = 1L;
	
	private String contentId = "-1";
	private String languageId = "-1";

	
    public String doExecute() throws Exception
    {
        return "success";
    }

	public String getContentId() 
	{
		return contentId;
	}

	public void setContentId(String contentId) 
	{
		this.contentId = contentId;
	}

	public String getLanguageId() 
	{
		return languageId;
	}

	public void setLanguageId(String languageId) 
	{
		this.languageId = languageId;
	}

}
