/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun PuppyList(puppies: List<Puppy>, puppyClick: (Puppy) -> Unit) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        content = {
            items(puppies, key = { it.id }) {
                PuppyEntry(it, puppyClick)
            }
        }
    )
}

@Composable
fun PuppyEntry(item: Puppy, puppyClick: (Puppy) -> Unit) {
    Row(
        modifier = Modifier
            .clickable(onClick = { puppyClick(item) })
            .padding(16.dp)
            .height(80.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        CoilImage(
            modifier = Modifier.fillMaxHeight()
                .width(160.dp),
            data = item.imageUrl, contentDescription = item.name,
            loading = {
                Box(Modifier.matchParentSize()) {
                    CircularProgressIndicator(Modifier.align(Alignment.Center))
                }
            }
        )
        Column(modifier = Modifier.padding(start = 16.dp)) {
            Text(text = "${item.name}, ${item.age}", style = MaterialTheme.typography.body1)
            Text(text = item.breed, modifier = Modifier.padding(top = 8.dp), style = MaterialTheme.typography.body2)
        }
    }
}

@Preview
@Composable
fun PuppyListPreview() {
    Surface(color = MaterialTheme.colors.background) {
        PuppyList(
            puppies = PuppyRepository().getPuppies(),
            puppyClick = {}
        )
    }
}
