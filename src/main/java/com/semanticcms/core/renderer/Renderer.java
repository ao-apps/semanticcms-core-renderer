/*
 * semanticcms-core-renderer - Renders SemanticCMS pages to various output formats.
 * Copyright (C) 2017, 2018, 2021  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of semanticcms-core-renderer.
 *
 * semanticcms-core-renderer is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * semanticcms-core-renderer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with semanticcms-core-renderer.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.semanticcms.core.renderer;

import com.semanticcms.core.model.Page;
import com.semanticcms.core.pages.CaptureLevel;
import java.io.IOException;
import java.util.Map;

/**
 * Implementations must be thread-safe.
 */
public interface Renderer {

	/**
	 * Gets the level the page should be captured at for this renderer.
	 */
	CaptureLevel getCaptureLevel();

	/**
	 * Creates a new page renderer with the given attributes.  Which attributes are
	 * required depends on the specific renderer implementation.
	 */
	// Java 1.8: Function<String, ? extends Object>
	PageRenderer newPageRenderer(Page page, Map<String, ? extends Object> attributes) throws IOException;

}
