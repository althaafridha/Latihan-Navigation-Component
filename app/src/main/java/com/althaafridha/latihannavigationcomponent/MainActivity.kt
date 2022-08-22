package com.althaafridha.latihannavigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.althaafridha.latihannavigationcomponent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

	private var _binding: ActivityMainBinding? = null
	private val binding get() = _binding!!

	private lateinit var appBarConfiguration : AppBarConfiguration

	private lateinit var navController: NavController

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		_binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)


		supportActionBar?.setDisplayHomeAsUpEnabled(true)

		val navHostFragment =
			supportFragmentManager.findFragmentById(R.id.my_nav_host_fragment) as NavHostFragment

		navController = navHostFragment.navController
		appBarConfiguration = AppBarConfiguration(navController.graph)


	}
	override fun onSupportNavigateUp(): Boolean {
		return findNavController(R.id.my_nav_host_fragment).navigateUp(appBarConfiguration)
	}

	override fun onBackPressed() {
		super.onBackPressed()
		finish()
	}
}