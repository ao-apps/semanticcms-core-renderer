/*
 * semanticcms-core-renderer - Renders SemanticCMS pages to various output formats.
 * Copyright (C) 2021, 2022, 2023, 2025  AO Industries, Inc.
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
module com.semanticcms.core.renderer {
  exports com.semanticcms.core.renderer;
  // Direct
  requires com.semanticcms.core.model; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-model</artifactId>
  requires com.semanticcms.core.pages; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-pages</artifactId>
}
