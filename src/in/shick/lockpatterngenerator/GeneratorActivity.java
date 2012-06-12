/*
Copyright 2010-2012 Michael Shick

This file is part of 'Lock Pattern Generator'.

'Lock Pattern Generator' is free software: you can redistribute it and/or
modify it under the terms of the GNU General Public License as published by the
Free Software Foundation, either version 3 of the License, or (at your option)
any later version.

'Lock Pattern Generator' is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more
details.

You should have received a copy of the GNU General Public License along with
'Lock Pattern Generator'.  If not, see <http://www.gnu.org/licenses/>.
*/
package in.shick.lockpatterngenerator;

import android.graphics.Point;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class GeneratorActivity extends BaseActivity implements PatternProvider
{
    protected LockPatternView mPatternView;

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // find views
        setContentView(R.layout.generator_activity);
        mPatternView = (LockPatternView) findViewById(R.id.pattern_view);

        // set up views
        mPatternView.setPatternProvider(this);
    }

    // provide current pattern to classes (LockPatternView)
    @Override
    public List<Point> providePattern()
    {
        return new ArrayList<Point>();
    }
}
