package org.madmeetup.core.dagger

import dagger.Component
import javax.inject.Singleton

/**
 * Created by nikthakkar on 7/1/17.
 */

@Singleton
@Component(modules = arrayOf(CoreModule::class))
interface CoreComponent {
}