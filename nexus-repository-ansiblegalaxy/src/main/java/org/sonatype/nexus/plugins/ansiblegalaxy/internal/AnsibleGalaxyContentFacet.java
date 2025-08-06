/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2020-present Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.plugins.ansiblegalaxy.internal;

import java.io.IOException;
import java.util.Optional;

import org.sonatype.nexus.repository.Facet;
import org.sonatype.nexus.repository.content.facet.ContentFacet;
import org.sonatype.nexus.repository.view.Content;
import org.sonatype.nexus.repository.view.Payload;

import org.sonatype.nexus.plugins.ansiblegalaxy.internal.metadata.AnsibleGalaxyModule;

@Facet.Exposed
public interface AnsibleGalaxyContentFacet extends ContentFacet {
  
  Optional<Content> get(String path);
  
  Content put(String path, Payload content) throws IOException;
  
  boolean delete(String path);
  
  Optional<Content> getMetadata(String path);
  
  Optional<AnsibleGalaxyModule> getModule(String namespace, String name, String version);
}