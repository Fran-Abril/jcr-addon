/*
 * Copyright © 2013-2019, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.jcr.fixtures;

import org.seedstack.seed.Install;

import com.google.inject.AbstractModule;

@Install
public class FixtureModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
        bind(TestConstructorFixture.class).to(TestConstructorFixtureImpl.class).asEagerSingleton();

    }

}
