package ltd.realquick.lock

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class LockActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!LockService.lock()) {
            startActivity(Intent(this, PermissionActivity::class.java))
        }
        finish()
    }
}
