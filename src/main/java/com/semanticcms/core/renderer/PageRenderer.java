/*
 * semanticcms-core-renderer - Renders SemanticCMS pages to various output formats.
 * Copyright (C) 2018  AO Industries, Inc.
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
 * along with semanticcms-core-renderer.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.semanticcms.core.renderer;

import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;

/**
 * Implementations do not need to be thread-safe as they are only used within
 * the span of a single thread.
 */
public interface PageRenderer extends Closeable {

	/**
	 * Gets the last modified time of the rendering of this page or {@code 0} if unknown.
	 */
	// Java 1.8: default method returning 0
	long getLastModified() throws IOException;

	/**
	 * Gets the content type, including any necessary character encoding.
	 */
	String getContentType() throws IOException;

	/**
	 * Gets the length of the rendered page, in bytes after character encoding,
	 * if known, or {@code -1} if unknown.
	 */
	long getLength() throws IOException;

	/**
	 * Renders the output for the page.  This will only be called once.
	 */
	void doRenderer(Writer out) throws IOException;

	/**
	 * A page renderer must be closed once completed.
	 */
	@Override
	void close() throws IOException;

}
