package com.example.stevenuniversecharacters

import android.app.ActionBar
import android.content.res.Configuration
import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.widget.LinearLayoutCompat
import com.example.fragmentfinalexample.InfoDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Are we displaying a fragment in the top/left
        if(supportFragmentManager.findFragmentById(R.id.content) == null){
            // No
            supportFragmentManager.beginTransaction()
                .add(R.id.content, BlankContent())
                .add(R.id.choices, Choices())
                .commit()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.menu_info -> InfoDialog()
                .show(supportFragmentManager, "info")
        }
        return super.onOptionsItemSelected(item)
    }

    fun chooseLetter(v: View){
        val fragment = Content()
        var args = Bundle()
        when (v.id) {
            R.id.a -> {
                args.putInt(Content.ARG_IMAGE_ID,
                    R.drawable.a)
                args.putString(Content.ARG_TEXT_ID,
                    "Amethyst")
            }
            R.id.b -> {
                args.putInt(Content.ARG_IMAGE_ID,
                    R.drawable.b)
                args.putString(Content.ARG_TEXT_ID,
                    "Bismuth")
            }
            R.id.c -> {
                args.putInt(Content.ARG_IMAGE_ID,
                    R.drawable.c)
                args.putString(Content.ARG_TEXT_ID,
                    "Connie Maheswaran")
            }
            R.id.g -> {
                args.putInt(Content.ARG_IMAGE_ID,
                    R.drawable.g)
                args.putString(Content.ARG_TEXT_ID,
                    "Garnet")
            }
            R.id.j -> {
                args.putInt(Content.ARG_IMAGE_ID,
                    R.drawable.j)
                args.putString(Content.ARG_TEXT_ID,
                    "Jasper")
            }
            R.id.l -> {
                args.putInt(Content.ARG_IMAGE_ID,
                    R.drawable.l)
                args.putString(Content.ARG_TEXT_ID,
                    "Lapis Lazuli")
            }
            R.id.p -> {
                args.putInt(Content.ARG_IMAGE_ID,
                    R.drawable.p)
                args.putString(Content.ARG_TEXT_ID,
                    "Pearl")
            }
            R.id.r -> {
                args.putInt(Content.ARG_IMAGE_ID,
                    R.drawable.r)
                args.putString(Content.ARG_TEXT_ID,
                    "Rose")
            }
            R.id.s -> {
                args.putInt(Content.ARG_IMAGE_ID,
                    R.drawable.s)
                args.putString(Content.ARG_TEXT_ID,
                    "Steven Universe")
            }
            R.id.w -> {
                args.putInt(Content.ARG_IMAGE_ID,
                    R.drawable.w)
                args.putString(Content.ARG_TEXT_ID,
                    "White Diamond")
            }
        }

        fragment.arguments = args
        supportFragmentManager.beginTransaction()
            .replace(R.id.content, fragment)
            .commit()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            mainLayout.orientation = LinearLayout.HORIZONTAL
            content.layoutParams.width = 0
            content.layoutParams.height = LinearLayout.LayoutParams.MATCH_PARENT
            choices.layoutParams.width = 0
            choices.layoutParams.height = LinearLayout.LayoutParams.MATCH_PARENT
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            mainLayout.orientation = LinearLayout.VERTICAL
            content.layoutParams.width = LinearLayout.LayoutParams.MATCH_PARENT
            content.layoutParams.height = 0
            choices.layoutParams.width = LinearLayout.LayoutParams.MATCH_PARENT
            choices.layoutParams.height = 0
        }
    }


}
