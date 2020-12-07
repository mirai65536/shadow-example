/*
 * Copyright (c) 2020, Мира Странная <rsxrwscjpzdzwpxaujrr@yahoo.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

public class SimpleLight implements ILight {
    private float x;
    private float y;
    private float maxDistance;
    private Color color;

    public SimpleLight(float x, float y, float maxDistance, Color color) {
        this.x = x;
        this.y = y;
        this.maxDistance = maxDistance;
        this.color = color;
    }

    @Override
    public float x() {
        return x;
    }

    @Override
    public float y() {
        return y;
    }

    @Override
    public float maxDistance() {
        return maxDistance;
    }

    @Override
    public Color color() {
        return color;
    }
}
